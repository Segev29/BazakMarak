package com.example.bazakmarak;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FBModule {
    FirebaseDatabase firebaseDatabase;
    Context context;
    ArrayList<Card> arrayList;
    public FBModule(Context context, ArrayList<Card> cards)
    {
        this.context = context;
        this.arrayList = cards;
        firebaseDatabase = FirebaseDatabase.getInstance("https://pokersegev-default-rtdb.europe-west1.firebasedatabase.app/");
        DatabaseReference reference = firebaseDatabase.getReference();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot userSnapshot: snapshot.getChildren())
                {
                    Card currentCard = userSnapshot.getValue(Card.class);
                    arrayList.add(currentCard);
                }
                //((MainActivity)context).dataChange();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
