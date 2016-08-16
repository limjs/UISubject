package com.example.tacademy.uisubject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-08-16.
 */
public class DrawerAdapter extends BaseExpandableListAdapter{
    DrawerGroup[] items;

    public DrawerAdapter(DrawerGroup[] items) {
        this.items = items;
    }

    @Override
    public int getGroupCount() {
        return items.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return items[i].children.size();
    }

    @Override
    public Object getGroup(int i) {
        return items[i];
    }

    @Override
    public Object getChild(int i, int child) {
        return items[i].children.get(child);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int childposition) {
        return childposition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean expanded, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_group, parent, false);
        } else {
            tv = (TextView) convertView;
        }
        tv.setText(items[groupPosition].groupname);
        return tv;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLast, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_child, parent, false);
        } else {
            tv = (TextView) convertView;
        }
        tv.setText(items[groupPosition].children.get(childPosition).childname);
        return tv;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
