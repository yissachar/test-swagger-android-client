package com.fave100.testswaggerclient;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.wordnik.client.ApiException;
import com.wordnik.client.api.FavelistApi;
import com.wordnik.client.model.StringResult;
import com.wordnik.client.model.StringResultCollection;

import java.io.IOException;
import java.util.List;

/**
 * Created by yissachar.radcliffe on 2/7/14.
 */
public class TrendingListTask extends AsyncTask<Void, Void, StringResultCollection> {

    Context context;
    View view;

    public TrendingListTask(Context context, View view) {
        this.context = context;
        this.view = view;
    }

    protected StringResultCollection doInBackground(Void... unused) {
        StringResultCollection trendingLists = null;

        FavelistApi api = new FavelistApi();
        try {
            trendingLists = api.getTrendingFaveLists();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return trendingLists;
    }

    protected void onPostExecute(StringResultCollection lists) {
        // Do something with the result.
        TableLayout favelist = (TableLayout) view.findViewById(R.id.favelist);

        for(StringResult list : lists.getItems()) {
            TableRow row = new TableRow(context);
            TextView text = new TextView(context);
            text.setText(list.getValue());
            row.addView(text);
            favelist.addView(row);
        }
    }
}
