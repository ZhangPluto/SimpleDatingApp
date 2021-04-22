package top.pluto.datingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

/**
 * @ProjectName DatingApp
 * @ClassName arrayAdapter
 * @Author renhaozhang
 * @Date 2021-04-22 12:26 AM
 **/
public class arrayAdapter extends ArrayAdapter<cards> {
    Context context;

    public arrayAdapter(@NonNull Context context, int resourceId, List<cards> items) {
        super(context, resourceId, items);

    }
    public View getView(int position, View convertView, ViewGroup parent){
        cards card_item = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        name.setText(card_item.getName());
//        Glide.with(getContext()).load(card_item.getProfileImageUrl()).into(image);

        return convertView;
    }
}
