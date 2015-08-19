package com.pragbits.stash.tools;

import java.util.LinkedList;
import java.util.List;

public class LesschatPayload {

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channelName) {
        this.channel = channelName;
    }

    private String channel;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public boolean isMrkdwn() {
        return mrkdwn;
    }

    public void setMrkdwn(boolean mrkdwn) {
        this.mrkdwn = mrkdwn;
    }

    private boolean mrkdwn;

    public boolean isLinkNames() {
        return link_names;
    }

    public void setLinkNames(boolean link_names) {
        this.link_names = link_names;
    }

    private boolean link_names;

    private List<LesschatAttachment> attachments = new LinkedList<LesschatAttachment>();

    public void addAttachment(LesschatAttachment lesschatAttachment) {
        this.attachments.add(lesschatAttachment);
    }

    public void removeAttachment(int index) {
        this.attachments.remove(index);
    }

}
