package readers

import gov.va.vinci.leo.cr.BatchDatabaseCollectionReader;

String driver = "com.mysql.jdbc.Driver"
String url = "jdbc:mysql://localhost:3306/<database_name>?autoReconnect=true&useSSL=false"
String username="<user>";
String password="<password>";
String query = "SELECT ID, NOTE_TEXT FROM <table_name> order by ID"

int startingIndex = 0;
int endingIndex = 10;
int batch_size = 10000;

reader = new BatchDatabaseCollectionReader(
        driver,
        url,
        username,
        password,
        query,
        "id","note_text",   /// Make sure that the names of the fields are low case.
        startingIndex , endingIndex
        , batch_size)
