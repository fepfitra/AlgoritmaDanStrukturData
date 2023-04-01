import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class preProcessor {
private ArrayList<String> content = new ArrayList<>();

preProcessor() {
}

preProcessor(ArrayList<String> arrList) {
this.setContent(arrList);
}

preProcessor readConsole(InputStream is) {
ArrayList<String> temp = new ArrayList<String>();
Scanner input = new Scanner(is);
while (input.hasNextLine()) {
String data = input.nextLine();
if (data.equals("")) break;
String[] words = data.split("\s+");
for (String word : words) {
temp.add(word);
}
}
input.close();
return new preProcessor(temp);
}

preProcessor readFile(String path) {
ArrayList<String> temp = new ArrayList<String>();
try {
File file = new File(path);
Scanner input = new Scanner(file);
while(input.hasNextLine()) {
String data = input.nextLine();
String[] words = data.split("\s+");
for (String word : words) {
temp.add(word);
}
}
input.close();
} catch(FileNotFoundException err) {
System.out.println("An error occurred");
err.printStackTrace();
}
return new preProcessor(temp);
}

ArrayList<String> getContent() {
return content;
}

void setContent(ArrayList<String> stringList) {
content = stringList;
}

preProcessor filter(String regex) {
ArrayList<String> temp = new ArrayList<String>();
content.forEach(item -> {
temp.add(item.replaceAll("[^A-Za-z ]", ""));
});
return new preProcessor(temp);
}

preProcessor toLowercase() {
ArrayList<String> temp = new ArrayList<String>();
content.forEach(item -> {
temp.add(item.toLowerCase());
});
return new preProcessor(temp);
}

preProcessor removeStopWords(String path) {
ArrayList<String> stopWords = new ArrayList<String>();
ArrayList<String> temp = new ArrayList<String>();
try {
File file = new File(path);
Scanner input = new Scanner(file);
while(input.hasNextLine()) {
String data = input.nextLine();
stopWords.add(data);
}
input.close();
}catch(FileNotFoundException err) {
System.out.println("An error occurred");
err.printStackTrace();
}
content.forEach(item -> {
StringBuilder sb = new StringBuilder();
String[] words = item.split("\s+");
for (String word : words) {
if (!stopWords.contains(word)) {
sb.append(word + " ");
}
}
temp.add(sb.toString().trim());
});

return new preProcessor(temp);
}

public preProcessor removeDuplicates() {
ArrayList<String> temp = new ArrayList<String>();
content.forEach(item -> {
String[] words = item.split(" ");
ArrayList<String> uniqueWords = new ArrayList<String>();
for (String word : words) {
if (!uniqueWords.contains(word)) {
uniqueWords.add(word);
}
}
String strTemp = String.join(" ", uniqueWords);
temp.add(strTemp);
});
return new preProcessor(temp);
}
}
