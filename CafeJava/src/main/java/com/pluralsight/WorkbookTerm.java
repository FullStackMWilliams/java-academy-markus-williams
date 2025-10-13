package com.pluralsight;

public class WorkbookTerm {
    private String workbook;
    private String term;
    private String definition;

    public WorkbookTerm(String workbook, String term, String definition) {
        this.workbook = workbook;
        this.term = term;
        this.definition = definition;
    }

    public String getWorkbook() {
        return workbook;
    }

    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    public void setWorkbook(String workbook) {
        this.workbook = workbook;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return term + " — " + definition;
    }
}
