package com.amjad.careershiksha.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Course;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<Course> cartList;
    CartItemClickListener listener;

    public CartAdapter(List<Course> cartList) {
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_cart, parent,false);
        return new CartAdapter.CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {
        Course cart = cartList.get(position);
        holder.bind(cart);


    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class
    CartViewHolder extends RecyclerView.ViewHolder {
        private ImageView cartImage;
        private TextView cartText;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            cartImage = itemView.findViewById(R.id.iv_cart_img);
            cartText = itemView.findViewById(R.id.tv_cart_text);
        }

        public void bind(Course cart) {
            Picasso.get().load(cart.getCouseImage()).into(cartImage);
            cartText.setText(cart.getCourseName());


        }
    }
}
