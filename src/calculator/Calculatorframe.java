package calculator;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
public class Calculatorframe extends Frame{
		private Panel panel1=new Panel();//��������ǰ���У���������Ĳ��ַ�ʽΪ���񲼾�
		private Panel panel2=new Panel();//�������ĺ����У���������ķ�ʽΪ�����鲼��
		private TextField textfiled=new TextField();//�����������������֣�һ���ı���
		public Calculatorframe() {
			super("����������");
			this.setLayout(new BorderLayout());//�������󲿷ֲ��ñ߽粼�֣��ֱ�ռ�ݱ����У���
			//��������������Ϊû������κζ�����Ĭ�ϴ�СΪ��
			//������Ϊ�����������
			this.add(textfiled, BorderLayout.NORTH);//����ı����ڱ�
			this.add(panel1, BorderLayout.CENTER);//�м���������
			this.setBounds(100,100,300,300);//���ö��㴰�ڴ�Сλ��
			this.add(panel2, BorderLayout.SOUTH);//�����������
			panel2.setPreferredSize(new Dimension(50, 70));//����������ϲ������Ĵ�С
			GridLayout grid=new GridLayout(4,5,5,5);//�в���������4��5��
			panel1.setLayout(grid);
			panel1.add(new Button("MC"));
			panel1.add(new Button("MR"));
			panel1.add(new Button("MS"));
			panel1.add(new Button("M+"));
			panel1.add(new Button("M-"));
			panel1.add(new Button("��"));
			panel1.add(new Button("CE"));
			panel1.add(new Button("C"));
			panel1.add(new Button("��"));
			panel1.add(new Button("��"));
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
			//���ϼ��м����������20����ť
			JButton button1=new JButton("1");
			JButton button2=new JButton("2");
			JButton button3=new JButton("3");
			JButton button4=new JButton("-");
			JButton button5=new JButton("=");
			JButton button6=new JButton("0");
			JButton button7=new JButton(".");
			JButton button8=new JButton("+");
			//����Ϊ�²������8����ť
			final GridBagConstraints s1=new GridBagConstraints();
			s1.gridx=0;		
			s1.gridy=0;
			//���ð�ťλ������
			s1.gridwidth=1;
			s1.gridheight=1;
			//����ռ�ݵ�����������1��1��
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
			s5.gridheight=2;		//=�����ť�߶�Ӧ��ռ�����У����ռһ��
			s5.fill=GridBagConstraints.VERTICAL;
			s5.insets=new Insets(5, 5, 5, 5);
			final GridBagConstraints s6=new GridBagConstraints();
			s6.gridx=0;
			s6.gridy=2;
			s6.gridheight=1;
			s6.gridwidth=2;		//0�����ť���Ӧ��ռ���У��߶�ռһ��
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
			this.addWindowListener(new MyWindowListener());//���ڹر�
		}		//���췽���ս�
			
				private class MyWindowListener extends WindowAdapter{

					@Override
					public void windowClosing(WindowEvent e) {
					System.exit(0);
					}
					
				}
}
