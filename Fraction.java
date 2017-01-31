public class Fraction{
	private int numerator;
	private int denominator;
	
	public Fraction(){
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int newNumerator){
		this.numerator = newNumerator;
		denominator = 1;
	}
	
	public Fraction(int newNumerator, int newDenominator){
		this.numerator = newNumerator;
		this.denominator = newDenominator;
	}
	
	public void setDenominator(int newDenominator){
		if (newDenominator!=0){
			this.denominator = newDenominator;
		}
	}
	
	public void inverse(){
		int inter = numerator;
		this.numerator = denominator;
		this.denominator = inter;
	}
	
	public Fraction times(Fraction other){
		return new Fraction(other.getNumerator()*this.getNumerator(), other.getDenominator()*this.getDenominator());
	}
	
	public Fraction divided(Fraction other){
		return new Fraction(other.getNumerator()*this.getDenominator(), other.getDenominator()*this.getNumerator());
	}
	
	public double toDouble(){
		return (double)(numerator/denominator);
	}
	
	public String toString(){
		return "the fraction " + numerator + " / " + denominator;
	}
	
	public Fraction add(Fraction other){
		int numer = other.getDenominator()*this.getNumerator() + other.getNumerator()*this.getDenominator();
		int denom = other.getDenominator()*this.getDenominator();
		
		return new Fraction(numer, denom);
	}
	
	public Fraction subtract(Fraction other){
		int numer = other.getDenominator()*this.getNumerator() - other.getNumerator()*this.getDenominator();
		int denom = other.getDenominator()*this.getDenominator();
		
		return new Fraction(numer, denom);
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	public int getDenominator(){
		return denominator;
	}
	
	public int compareTo(Fraction other){
		if (this.toDouble()>other.toDouble()){
			return -1;
		}
		if (this.toDouble()==other.toDouble()){
			return 0;
		}
		return 1;
	}
	
}