package edu.aku.hassannaqvi.wbcct_baseline.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;


public class FamilyMembersAdapter extends RecyclerView.Adapter<FamilyMembersAdapter.ViewHolder> {
    private static final String TAG = "FamilyMembersAdapter";
    private final Context mContext;
    private final List<FamilyMembers> member;
    private final int mExpandedPosition = -1;
    private final int completeCount;
    private boolean motherPresent = false;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param members List<FemaleMembersModel> containing the data to populate views to be used by RecyclerView.
     */
    public FamilyMembersAdapter(Context mContext, List<FamilyMembers> members) {
        this.member = members;
        this.mContext = mContext;
        completeCount = 0;
        MainApp.memberComplete = false;

    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");
        FamilyMembers members = this.member.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView fName = viewHolder.fName;
        TextView fAge = viewHolder.fAge;
        TextView memCate = viewHolder.memCate;
        TextView recipient = viewHolder.recipient;
        TextView motherName = viewHolder.motherName;
        // LinearLayout subItem = viewHolder.subItem;
        ImageView fmRow = viewHolder.fmRow;
        ImageView mainIcon = viewHolder.mainIcon;
        // TextView addSec = viewHolder.addSec;
        TextView fMaritalStatus = viewHolder.fMatitalStatus;
        TextView secStatus = viewHolder.secStatus;
        View cloaked = viewHolder.cloak;
        View indexedBar = viewHolder.indexedBar;
        //String pregStatus = familyMember.getRb07().equals("1") ? "Pregnant" : "Not Pregnant";

        MainApp.memberComplete = completeCount == MainApp.memberCount;

        fName.setText(members.getA202());
        fAge.setText(members.getA206y() + "y ");
        motherName.setText(null);
        String motherRelation = "";

/** Select mother IF
 *  Mother is alive and present in house
 */
        if (!members.getA21301().equals("") && !members.getA21301().equals("97")
        ) {
            if (members.getA204().equals("1")) {
                motherRelation = " S/o ";
            } else {
                motherRelation = " D/o ";

            }
            motherName.setText(motherRelation + MainApp.familyList.get(Integer.parseInt(members.getA21301()) - 1).getA202());
            motherPresent = MainApp.familyList.get(Integer.parseInt(members.getA21301()) - 1).getA214().equals("1");

        }
    /*      <string name="hl701"> Married </string>
            <string name="hl702"> Widowed </string>
            <string name="hl703"> Divorced </string>
            <string name="hl704"> Separated </string>
            <string name="hl705"> Un-Married </string>
            <string name="hl7099"> Not Applicable (for Age less 13 years old) </string>*/
        String marStatus = "";
        switch (members.getA208()) {
            case "1":
                marStatus = "Married";
                break;
            case "2":
                marStatus = "Widowed";
                break;
            case "3":
                marStatus = "Divorced";
                break;
            case "4":
                marStatus = "Separated";
                break;
            case "5":
                marStatus = "Un-Married";
                break;
            case "99":
                marStatus = "n/a";
                break;
            default:
                marStatus = "Unknown";
                break;
        }

        String idxStatus = "";

        int idxColor;

        idxStatus = "         ";
        idxColor = mContext.getResources().getColor(R.color.white);
        if (members.getIndexed().contains("1")) {
            idxStatus = "      Child     ";
            idxColor = mContext.getResources().getColor(R.color.childBg);
        }
        if (members.getIndexed().contains("2")) {
            idxStatus = "     Mother     ";
            idxColor = mContext.getResources().getColor(R.color.motherBg);
        }
        if (members.getIndexed().contains("3")) {
            idxStatus = "    Caregiver   ";
            idxColor = mContext.getResources().getColor(R.color.adolMaleBg);
        }
        if (members.getIndexed().contains("R")) {
            idxStatus = " BISP Recipient ";
            idxColor = mContext.getResources().getColor(R.color.adolFemaleBg);
        }


        fMaritalStatus.setText(marStatus);
        secStatus.setText(idxStatus);
        secStatus.setBackgroundColor(idxColor);


        cloaked.setVisibility(!members.getMemCate().equals("") ? View.GONE : View.VISIBLE);
        mainIcon.setImageResource(members.getA214().equals("1") ? (members.getA204().equals("1") ? R.drawable.ic_boy : R.drawable.ic_girl) : R.drawable.ic_not_available);
        //MainApp.selectedMWRA = members.getIndexed().equals("1") || members.getIndexed().equals("2") ? "-" : "";
        mainIcon.setBackgroundColor(members.getA214().equals("1") ? (members.getIndexed().equals("1") ? mContext.getResources().getColor(R.color.greenLight) : members.getIndexed().equals("2") ? mContext.getResources().getColor(android.R.color.holo_orange_dark) : members.getA204().equals("1") ? mContext.getResources().getColor(R.color.boy_blue) : mContext.getResources().getColor(R.color.girl_pink)) : mContext.getResources().getColor(R.color.gray));
        //  mainIcon.setBackgroundColor(  ((ColorDrawable) mainIcon.getBackground()).getColor());
        if (members.getMemCate().equals("2"))
            cloaked.setVisibility(motherPresent ? View.GONE : View.VISIBLE);

        if (!MainApp.selectedMWRA.equals("")) {
            cloaked.setVisibility(members.getIndexed().equals("") ? View.VISIBLE : View.GONE);
            indexedBar.setVisibility(members.getIndexed().equals("") ? View.GONE : View.VISIBLE);
        }
        memCate.setText("        ");
        if (!members.getMemCate().equals("")) {
            switch (members.getMemCate().substring(0, 1)) {
                case "1":

                    break;
                case "2":

                    memCate.setText("Child");

                    break;
                case "3":
                    memCate.setText("PW");
                    break;

                default:
                    // memCate.setVisibility(View.GONE);
            }

            if (members.getMemCate().contains("R")) {
                recipient.setVisibility(View.VISIBLE);

          /*      if (!memCate.getText().equals("")) {
                    memCate.setText(memCate.getText() + " | BISP");
                } else {
                    memCate.setText("BISP");
                }*/
            }
        }
        //fMaritalStatus.setText("Children: " + familyMember.getH226m() + " boy(s), " + familyMember.getH226f() + " girl(s)");
      /*  viewHolder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.familyMember = MainApp.familyMember.get(position);
            Intent intent = new Intent(mContext, SectionBActivity.class);

            intent.putExtra("position", position);

            MainApp.selectedFemale = position;

            intent.putExtra("position", position);

            ((Activity) mContext).startActivityForResult(intent, 2);


        });*/

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.famlily_member_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return member.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView fName;
        private final TextView memCate;
        private final TextView fAge;
        private final TextView fMatitalStatus;
        private final TextView motherName;
        private final TextView secStatus;
        private final TextView recipient;
        //private final TextView addSec;
        //private final LinearLayout subItem;
        private final ImageView fmRow;
        private final ImageView mainIcon;
        private final View cloak;
        private final View indexedBar;


        public ViewHolder(View v) {
            super(v);
            fName = v.findViewById(R.id.chh02);
            memCate = v.findViewById(R.id.memCate);
            fAge = v.findViewById(R.id.chh05);
            fMatitalStatus = v.findViewById(R.id.chh06);
            motherName = v.findViewById(R.id.chh08);
            secStatus = v.findViewById(R.id.csecStatus);
            recipient = v.findViewById(R.id.recipient);
            //  addSec = v.findViewById(R.id.cadd_section);
            //  subItem = v.findViewById(R.id.csubitem);
            fmRow = v.findViewById(R.id.cfmRow);
            mainIcon = v.findViewById(R.id.mainIcon);
            cloak = v.findViewById(R.id.cloaked);
            indexedBar = v.findViewById(R.id.indexedBar);

        }

        public TextView getTextView() {
            return fName;
        }
    }


}
