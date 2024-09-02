package sayanijava;

public class RewardValue
{
	private double cashValue;
	private int milesValue;
	private static final double miles_conversion_rate = 0.0035;
	
	public RewardValue(double cashValue)
	{
		this.cashValue = cashValue;
		this.milesValue = (int)(cashValue / miles_conversion_rate);
	}
	public RewardValue(int milesValue)
	{
		this.milesValue = milesValue;
		this.cashValue = milesValue * miles_conversion_rate;
	}
	public double getCashValue()
	{
		return cashValue;
	}
	public int getMilesValue()
	{
		return milesValue;
	}
	public int cashToMiles()
	{
		return (int)(cashValue / miles_conversion_rate);
	}
	public double milesToCash()
	{
		return milesValue * miles_conversion_rate;
	}
}