package com.kharis.recyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kharis.recyclerview.R;
import com.kharis.recyclerview.models.Contact;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyHolder> {
    List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    private OnContactClickListener listener;

    public interface OnContactClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        return new MyHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Contact contact = contactList.get(position);

        holder.txtNama.setText(contact.getNama());
        holder.txtTlp.setText(contact.getTlp());

        Picasso.get().load(contact.getImgURL()).placeholder(R.drawable.ic_launcher_background).into(holder.imgContact);
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imgContact;
        TextView txtNama, txtTlp;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imgContact = itemView.findViewById(R.id.img_contact);
            txtNama = itemView.findViewById(R.id.txt_nama);
            txtTlp = itemView.findViewById(R.id.txt_tlp);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
