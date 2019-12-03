package com.fish4fun.likegooglemaps.helpers;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    private final int top;
    private final int bottom;
    private final int left;
    private final int right;

    public SpaceItemDecoration(int all) {
        this.top = all;
        this.bottom = all;
        this.left = all;
        this.right = all;

    }

    public SpaceItemDecoration(int top, int bottom, int left, int right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.top = top;
        outRect.bottom = bottom;
        outRect.left = left;
        outRect.right = right;
    }
}
