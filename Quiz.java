public static String scrambleWord(String word){
  /* To be implemented in part (a) */
String newWord = word;
if (newWord.equals(""))
{
  return newWord;
}

for ( int i=0; i<newWord.length();i++)
{
  if (newWord.indexOf(i).equals('A') && (newWord.indexOf(i+1).equals('A')))
  {
  newWord= newWord.substring(i+1,1) + newWord.substring(i,1) + newWord.substring(1,newWord.length()-1);

  }
  else if (newWord.indexOf(i).equals('A') && newWord.indexOf(i+1).equals('A'))
  {
    newWord=newWord;
  }
  else
  {
    return newWord;
  }

}
return newWord; 
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for (int i=0; i<wordList.length; i++)
  if (wordlist[i] = (scrambleWord(word).equals(scrambleWord(newWord))))
  {
    wordList[i] = newWord;
  }

}
