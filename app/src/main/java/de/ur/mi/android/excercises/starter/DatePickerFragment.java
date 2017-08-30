package de.ur.mi.android.excercises.starter;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;



public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);

        }

    public void onDateSet(DatePicker view, int year, int month, int day){
        TextView textView = (TextView) getActivity().findViewById(R.id.date);

        GregorianCalendar date = new GregorianCalendar(year, month, day);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
        String dateString = df.format(date.getTime());

        textView.setText(dateString);
    }
}
