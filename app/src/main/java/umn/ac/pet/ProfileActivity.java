package umn.ac.pet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    FirebaseUser firebaseUser;
    DatabaseReference userRef;
    FirebaseDatabase firebaseDatabase;

    TextView username, level, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        userRef= firebaseDatabase.getReference("Users");
        username = findViewById(R.id.username);
        level = findViewById(R.id.level);
        exp = findViewById(R.id.exp);

        getUserData();
    }

    private void getUserData(){
        userRef.child(firebaseUser.getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                username.setText(user.getUsername());
                level.setText(user.getLevel());
                exp.setText(user.getExp());
                Log.i("AYO  O OOOOOOOOOOOOOOO " , "ASSDJASDJKASJDSAJKDS");
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(ProfileActivity.this, "Fail to get data.", Toast.LENGTH_SHORT).show();

            }
        });

    }
}