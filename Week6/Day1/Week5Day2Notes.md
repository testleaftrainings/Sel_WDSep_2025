###############################################################################


Read Excel:

<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>

<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>


##################################################################################
How to read data from Excel:



steps to create excelsheet in data folder:

1.rightclick--->project--->clicknew-->folder--->foldername-->data-->finish
2.right click on the folder--->show in--->system explorer-->doubleclick on data-->rightclick-->new--->ms excelsheet.

Excel:
Login.xls= -> Microsoft excel spreadsheet
Login.xlsx -> Microsoft excel spreadsheet in xml format

XSSF-> XML SpreadSheet Format


Step1-> Set path for workbook
step2-> Get into the sheet
Step3-> Get into Row values
Step4-> Get into cell values
Step5-> Read Data from workbook and print
Step6-> close the workbook


###########################################################################

# Steps to do Excel Integration:

1. Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
String[][] data = new String[rowCount][columnCount];

2. Push stringCellValue to the Array
DataProvider what index value it will be started - 0
Excel program what index value for row - 1

convert excel into DataProvider
data[i-1][j]=stringCellValue;


3. Close the workbook and return the data
wBook.close();
return data;
4. Change main method to a normal static method -retrain the static keyword
public static String[][] readExcel(){
}
5. Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
    
return ReadExcel.readExcel();

##########################################################################


# Steps to create excel sheet in data folder:
   - Right click -> Project -> Click New -> Click folder -> Folder name -> Finish
   - Right click on the data folder -> Show in system Explorer -> Open the data folder ->
     Create new Workbook-> Fill the datas in the excel sheet -> Select the data and Save and close
   - In eclipse -> refresh the data folder -> view the excel sheet

# How to do read data from Excel?
  - Microsoft Excel
  - Apache POI (access MS office software) using Java
  - Data from Excel
  - Excel extensions: .xls , .xlsx 
  .xlsx -> XSSFWorkBook 

  Workbook (CreateLead.xlsx)
    - WorkSheet (Sheet1, Sheet2)
       - Rows
         - Column(Cell)

# Steps:
   - Open the workbook using file name and the path of your file
   - Go to the Specific sheet (Sheet name / Sheet index)
   - Go to the Specific Row (by index)
   - Go to the specific Columns(Cell) -> By index


