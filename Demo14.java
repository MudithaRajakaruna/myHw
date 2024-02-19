void main() {
    final String[][] data = {{"1", "2", "3", "4"}, {"Kasun", "Nuwan", "Ruwan", "supun"}, {"077-1234567", "078-1234567", "071-1234567", "041-1234567"}, {"011-1234567", "-", null, "033-1234667"}};
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-".repeat(12)}+\{"-".repeat(12)}+";
    final String HEADER = "\033[44;1m|%-5s|%-8s|%-12s|%12s|\033[0m".formatted("ID", "NAME", "Contact1", "Contact2");
    final String ROW = "|%-5s|%-8s|%-12s|%12s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);
    for (int i = 0; i < 4; i++) {
        String currentIndex = genIndex(data[0], i);
        String currentName = generateData(data[1], i);
        String currentContact1 = generateData(data[2], i);
        String currentContact2 = genContact2(data[3], i);
        System.out.printf(ROW, currentIndex, currentName, currentContact1, currentContact2);
        System.out.println(LINE);

    }


}

String genIndex(String[] indexArray, int iteeration) {
    return "C-%03d".formatted(Integer.parseInt(indexArray[iteeration]));
}

String generateData(String[] myArray, int iteration) {
    return myArray[iteration];
}

String genContact2(String[] myArray, int iteration) {
    String num2 = myArray[iteration];
    return num2 == "" || num2 == null ||num2== "-" ? "Unfilled" : num2;
}


