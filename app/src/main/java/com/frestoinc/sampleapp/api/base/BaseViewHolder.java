package com.frestoinc.sampleapp.api.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by frestoinc on 01,February,2020 for SampleApp.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

  public BaseViewHolder(@NonNull View itemView) {
    super(itemView);
  }
}
