package semestr1.practice7;

public class QueryBuilder {
    private String table;
    private String fields = "*";
    private String whereClause = "";

    public QueryBuilder(String table) {
        this.table = table;
    }
    public QueryBuilder select(String fields){
        this.fields = fields;
        return this;
    }
    public QueryBuilder where(String condition) {
        this.whereClause = condition;
        return this;
    }
    public String build() {
        return "SELECT " + fields + " FROM " + table
                + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
    }
}

