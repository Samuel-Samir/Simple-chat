package com.example.ecss.medicalmapper.chatingSystem.model;

import android.app.AlertDialog;
import android.content.Context;

import com.example.ecss.medicalmapper.R;
import com.google.firebase.database.Exclude;

import java.util.Random;

/**
 * Created by samuel on 5/8/2017.
 */
public class ChatMessage {

    private String message;
    private String sender;
    private String recipient;

    private int mRecipientOrSenderStatus;

    public ChatMessage() {
    }

    public ChatMessage(String message, String sender, String recipient) {
        this.message = message;
        this.recipient = recipient;
        this.sender = sender;
    }


    public void setRecipientOrSenderStatus(int recipientOrSenderStatus) {
        this.mRecipientOrSenderStatus = recipientOrSenderStatus;
    }


    public String getMessage() {
        return message;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    @Exclude
    public int getRecipientOrSenderStatus() {
        return mRecipientOrSenderStatus;
    }
}
