package com.ASC.OOP.main;

public class USR_Mess_Model {
    private     String      Id;
    private     String      ThreadId;
    private     String[]    LabelIds;
    private     String      Snippet;
    private     String      HistoryId;
    private     String      InternalDate;
    private     int         SizeEstimate;
    private     String      Raw;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getThreadId() {
        return ThreadId;
    }

    public String[] getLabelIds() {
        return LabelIds;
    }

    public void setLabelIds(String[] labelIds) {
        LabelIds = labelIds;
    }

    public void setThreadId(String threadId) {
        ThreadId = threadId;
    }

    public String getSnippet() {
        return Snippet;
    }

    public void setSnippet(String snippet) {
        Snippet = snippet;
    }

    public String getHistoryId() {
        return HistoryId;
    }

    public void setHistoryId(String historyId) {
        HistoryId = historyId;
    }

    public String getInternalDate() {
        return InternalDate;
    }

    public void setInternalDate(String internalDate) {
        InternalDate = internalDate;
    }

    public int getSizeEstimate() {
        return SizeEstimate;
    }

    public void setSizeEstimate(int sizeEstimate) {
        SizeEstimate = sizeEstimate;
    }

    public String getRaw() {
        return Raw;
    }

    public void setRaw(String raw) {
        Raw = raw;
    }
}
