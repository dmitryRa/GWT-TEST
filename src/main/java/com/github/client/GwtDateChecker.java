package com.github.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import java.awt.*;

public class GwtDateChecker implements EntryPoint {

    private Button button;
    private TextBox textArea;
    private ListBox listBox;
    private Myhandler myhandler = new Myhandler();
    public void onModuleLoad() {
        button = new Button("OK");
        textArea = new TextBox();
        listBox = new ListBox();
        listBox.addItem("dd.mm.yy");
        listBox.addItem("dd.mm.yyyy");
        listBox.addItem("dd/mm/yy");
        listBox.addItem("dd/mm/yyyy");


        RootPanel.get("nameFieldContainer").add(textArea);
        RootPanel.get("sendButtonContainer").add(button);
        RootPanel.get("listDateContainer").add(listBox);


    }
    class Myhandler implements ClickHandler,KeyUpHandler{


        public void onClick(ClickEvent clickEvent) {
            checkDateFormat();
        }

        private void checkDateFormat() {


        }

        public void onKeyUp(KeyUpEvent keyUpEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
