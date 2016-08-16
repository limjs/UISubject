package com.example.tacademy.uisubject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tacademy on 2016-08-16.
 */
public class DrawerGroup {
    public String groupname;
    public int groupid;
    public List<DrawerChild> children = new ArrayList<>();

    public DrawerGroup(String groupname, int groupid, DrawerChild... children) {
        this.groupname = groupname;
        this.groupid = groupid;
        this.children.addAll(Arrays.asList(children));
    }
}
