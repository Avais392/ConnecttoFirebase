package com.example.apple.connecttofirebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class firebaseRef {
    static int count=0;
    FirebaseDatabase database ;
    DatabaseReference myRef ;
    private static final firebaseRef ourInstance = new firebaseRef();

    public static firebaseRef getInstance() {
        return ourInstance;
    }

    private firebaseRef() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("message");
    }
}
