package com.example.faza.finaltes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentHome extends Fragment {

    ListView listView;
    String[] makananName = {"Nasi Goreng","Nasi Padang","Lalapan Ayam","Soto Lamongan","Pecel Lele"};

    int[] makananImages = {R.drawable.makanan1,R.drawable.makanan2,R.drawable.makanan3,R.drawable.makanan4,R.drawable.makanan5};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        listView = (ListView) rootView.findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),DetilMakanan.class);
                intent.putExtra("name",makananName[position]);
                intent.putExtra("image",makananImages[position]);
                startActivity(intent);

            }
        });
        return rootView;
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return makananImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.item_makanan,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.txtJudul);
            ImageView image = view1.findViewById(R.id.imgMakanan);

            name.setText(makananName[i]);
            image.setImageResource(makananImages[i]);
            return view1;



        }
    }
}
