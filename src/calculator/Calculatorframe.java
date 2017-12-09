package calculator;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
public class Calculatorframe extends Frame{
		private Panel panel1=new Panel();//计算器的前四行，其上组件的布局方式为网格布局
		private Panel panel2=new Panel();//计算器的后两行，其上组件的方式为网格组布局
		private TextField textfiled=new TextField();//计算器的输出结果部分，一个文本框
		public Calculatorframe() {
			super("计算器界面");
			this.setLayout(new BorderLayout());//以上三大部分采用边界布局，分别占据北，中，南
			//东西两个部分因为没有填充任何东西而默认大小为零
			//故整体为上中下三大块
			this.add(textfiled, BorderLayout.NORTH);//输出文本框在北
			this.add(panel1, BorderLayout.CENTER);//中间四行在中
			this.setBounds(100,100,300,300);//设置顶层窗口大小位置
			this.add(panel2, BorderLayout.SOUTH);//最后两层在南
			panel2.setPreferredSize(new Dimension(50, 70));//调节填充在南部的面板的大小
			GridLayout grid=new GridLayout(4,5,5,5);//中部网格设置4行5列
			panel1.setLayout(grid);
			panel1.add(new Button("MC"));
			panel1.add(new Button("MR"));
			panel1.add(new Button("MS"));
			panel1.add(new Button("M+"));
			panel1.add(new Button("M-"));
			panel1.add(new Button("←"));
			panel1.add(new Button("CE"));
			panel1.add(new Button("C"));
			panel1.add(new Button("±"));
			panel1.add(new Button("√"));
			panel1.add(new Button("7"));
			panel1.add(new Button("8"));
			panel1.add(new Button("9"));
			panel1.add(new Button("/"));
			panel1.add(new Button("%"));
			panel1.add(new Button("4"));
			panel1.add(new Button("5"));
			panel1.add(new Button("6"));
			panel1.add(new Button("*"));
			panel1.add(new Button("1/x"));
			//以上即中间四行所需的20个按钮
			JButton button1=new JButton("1");
			JButton button2=new JButton("2");
			JButton button3=new JButton("3");
			JButton button4=new JButton("-");
			JButton button5=new JButton("=");
			JButton button6=new JButton("0");
			JButton button7=new JButton(".");
			JButton button8=new JButton("+");
			//以上为下部所需的8个按钮
			final GridBagConstraints s1=new GridBagConstraints();
			s1.gridx=0;		
			s1.gridy=0;
			//设置按钮位置坐标
			s1.gridwidth=1;
			s1.gridheight=1;
			//设置占据的行列数，即1行1列
			s1.insets=new Insets(5,5,5,5);
			final GridBagConstraints s2=new GridBagConstraints();
			s2.gridx=1;
			s2.gridy=0;
			s2.gridheight=1;
			s2.gridwidth=1;
			s2.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s3=new GridBagConstraints();
			s3.gridx=2;
			s3.gridy=0;
			s3.gridheight=1;
			s3.gridwidth=1;
			s3.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s4=new GridBagConstraints();
			s4.gridx=3;
			s4.gridy=0;
			s4.gridheight=1;
			s4.gridwidth=1;
			s4.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s5=new java.awt.GridBagConstraints();
			s5.gridx=4;
			s5.gridy=0;
			s5.gridwidth=1;
			s5.gridheight=2;		//=这个按钮高度应当占据两行，宽度占一列
			s5.fill=GridBagConstraints.VERTICAL;
			s5.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s6=new GridBagConstraints();
			s6.gridx=0;
			s6.gridy=2;
			s6.gridheight=1;
			s6.gridwidth=2;		//0这个按钮宽度应当占两列，高度占一列
			s6.insets=new Insets(5, 5, 5, 5);
			s6.fill=GridBagConstraints.HORIZONTAL;
			final GridBagConstraints s7=new GridBagConstraints();
			s7.gridx=2;
			s7.gridy=2;
			s7.gridheight=1;
			s7.gridwidth=1;
			s7.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s8=new GridBagConstraints();
			s8.gridx=3;
			s8.gridy=2;
			s8.gridheight=1;
			s8.gridwidth=1;
			s8.insets=new Insets(5, 5, 5, 5);
			panel2.add(button1, s1);
			panel2.add(button2, s2);
			panel2.add(button3, s3);
			panel2.add(button4, s4);
			panel2.add(button5, s5);
			panel2.add(button6, s6);
			panel2.add(button7, s7);
			panel2.add(button8, s8);
			setVisible(true);
			this.addWindowListener(new MyWindowListener());//窗口关闭
		}		//构造方法终结
			
				private class MyWindowListener extends WindowAdapter{

					@Override
					public void windowClosing(WindowEvent e) {
					System.exit(0);
					}
					
				}
}
