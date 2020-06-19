import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class QuestionDiagnosis implements ActionListener {
	private int selfharm, ptsd, depression, pride;
	JFrame base;
	JRadioButton b1, b2, b3, b4;
	JButton sb1, sb2;
	JLabel la1, la2, stat;
	ButtonGroup bg;
	String questions[]= {"How are you?", "What's your current feeling?", 
						"Pick one statement that describes you best.", "What do you think is your worst problem?",
						"Do you think you can solve it without help?", "Or do you need help?", 
						"Do you believe in the power of this diagnosis?", "Do you REALLY believe you have such disability?"};
	String opt1[]= {"I'm feeling good", "Somewhat excited", "Above all others", "Thinking myself too highly", "I'm supposed to?", 
					"Mind is saying no", "Not sure", "Sort of"};
	String opt2[]= {"Not super good","Lost","Frequent Uncertainty","Having limited, unknown decisions","Not sure","Definately","Yes","Yes"};
	String opt3[]= {"Who am I?","Regretful","A mistake","From an action I did some time ago","It's my responsibility",
					"Any is appreciated","I doubt it","No"};
	String opt4[]= {"Not fine","Pushed to the edge","Failed","Myself","No longer","Someone can try","Someone else can learn from it","100%",};
	
	int nq;
	QuestionDiagnosis(){
		base = new JFrame();
		base.setLayout(null);
		base.setSize(500, 500);
		Container c = base.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		
		la1 = new JLabel(questions[0]);
		la1.setBounds(50, 50, 300, 30);
		base.add(la1);
		la1.setFont(new Font("bahnschrift", Font.BOLD, 15));
		
		stat = new JLabel();
		stat.setBounds(70, 410, 400, 80);
		stat.setFont(new Font("bell mt", Font.BOLD, 18));
		base.add(stat);
		
		b1 = new JRadioButton(opt1[0]);
		b1.setBounds(100 ,120 ,100 ,30 );
		base.add(b1);
		
		b2 = new JRadioButton(opt2[0]);
		b2.setBounds(350,120,100,30);
		base.add(b2);
		
		b3 = new JRadioButton(opt3[0]);
		b3.setBounds(100,200,100,30);
		base.add(b3);
		
		b4 = new JRadioButton(opt4[0]);
		b4.setBounds(350,200,100,30);
		base.add(b4);
		
		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		bg.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		sb1 = new JButton("Submit");
		sb1.setBounds(90, 380, 90, 30);
		base.add(sb1);
		
		sb2 = new JButton("Next Question");
		sb2.setBounds(250,400,100,30);
		base.add(sb2);
		
		sb1.addActionListener(this);
		sb2.addActionListener(this);
		base.setVisible(true);
	}
	public static void main(String args[]) {
		new QuestionDiagnosis();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sb1) {
			String en="";
			if(b1.isSelected()) {
				en = b1.getText();
				setPride(getPride()+1);
			}
			if(b2.isSelected()) {
				en = b2.getText();
				setDepression(getPride()+1);
			}
			if(b3.isSelected()) {
				en = b3.getText();
				setPtsd(getPride()+1);
			}
			if(b4.isSelected()) {
				en = b4.getText();
				setSelfharm(getPride()+1);
			}
		}
		if(e.getSource()==sb2) {
			nq++;
			la1.setText(questions[nq]);
			b1.setText(opt1[nq]);
			b2.setText(opt2[nq]);
			b3.setText(opt3[nq]);
			b4.setText(opt4[nq]);
			stat.setText("Pride: " + getPride() + ", " + "Depression: " + getDepression() + ", " + "Depression: " + getPtsd() + ", " + getSelfharm());
		}
	}
	public int getSelfharm() {
		return selfharm;
	}
	public void setSelfharm(int selfharm) {
		this.selfharm = selfharm;
	}
	
	public int getPtsd() {
		return ptsd;
	}
	public void setPtsd(int ptsd) {
		this.ptsd = ptsd;
	}
	public int getDepression() {
		return depression;
	}
	public void setDepression(int depression) {
		this.depression = depression;
	}
	
	public int getPride() {
		return pride;
	}
	public void setPride(int pride) {
		this.pride = pride;
	}
	
}
