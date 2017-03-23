package task;

public abstract class Figure {
	private String m_figName;
		
	@Override
	public String toString() {
		return  m_figName;
	}

	public String getM_figName() {
		return m_figName;
	}

	public void setM_figName(String m_figName) {
		this.m_figName = m_figName;
	}

	public abstract double perimeter();
	
}
