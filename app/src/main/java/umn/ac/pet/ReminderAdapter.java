package umn.ac.pet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {

        private Context mContext;
        List<Reminder> mReminder;
        public ReminderAdapter(Context mContext, List<Reminder> mReminder){
            this.mReminder= mReminder;
            this.mContext=mContext;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.reminder_items,parent,false);
            return new ReminderAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Reminder reminder = mReminder.get(position);
            holder.name.setText(reminder.getName());
            holder.date_time.setText(reminder.getDate()+ " " + reminder.getTime());
            holder.repeat_info.setText("Every " + reminder.getRepeat_interval() + reminder.getRepeat_type());

        }

        @Override
        public int getItemCount() {
            return mReminder.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            TextView name, date_time, repeat_info;

            public ViewHolder(@NonNull View itemView){
                super(itemView);
                name = itemView.findViewById(R.id.title);
                date_time = itemView.findViewById(R.id.date_time);
                repeat_info = itemView.findViewById(R.id.repeat_info);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*User user=mUsers.get(getAdapterPosition());
                        Intent i=new Intent(mContext, DetailUser.class);
                        i.putExtra("angkatan",user.getAngkatan());
                        i.putExtra("displayname",user.getDisplayName());
                        i.putExtra("nama",user.getNamalengkap());
                        i.putExtra("pp",user.getProfilePic());
                        i.putExtra("nim",user.getNim());
                        i.putExtra("status",user.getStatusPekerjaan());
                        i.putExtra("pekerjaan",user.getPekerjaan());
                        i.putExtra("nohp",user.getNomorhp());
                        i.putExtra("domisili",user.getDomisili());
                        mContext.startActivity(i);*/
                    }
                });

            }
        }



    }
