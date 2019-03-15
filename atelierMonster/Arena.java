class Arena {
	public static void main(String[] args) {

		Monster Skaven = new Monster("Skaven", 14, 98);
		Monster Orc = new Monster("Orc", 24, 30);

		while (!Skaven.isKo() && !Orc.isKo()){
		Skaven.takeHit(Orc.getAttack());
		Orc.takeHit(Skaven.getAttack());
		}
	}
}

