function reverseWords(sentence) {
    // Split the sentence into an array of words
    const words = sentence.split(' ');
  
    // Iterate through each word and reverse it
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Take input from the user
  const inputSentence = prompt('Enter a sentence:');
  const reversed = reverseWords(inputSentence);
  
  console.log('Original Sentence:', inputSentence);
  console.log('Reversed Words:', reversed);
  