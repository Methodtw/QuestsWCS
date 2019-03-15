class SecretSentence {
	
	public static void main(String[] args) {
		String Sentence = writeSecretSentence("Chat", "Souris");
		System.out.println(Sentence);

	}

	public static String writeSecretSentence (String cat, String mouse) {
		return cat + " s'incline face à " + mouse;
	}
}
