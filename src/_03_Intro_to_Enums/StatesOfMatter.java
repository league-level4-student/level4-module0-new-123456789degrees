package _03_Intro_to_Enums;
enum StatesOfMatter {
	SOLID(0.0), LIQUID(25.55), GAS(100.0);
	double celciusTemp;
	private StatesOfMatter(double celciusTemp) {
		this.celciusTemp = celciusTemp;
	}
}