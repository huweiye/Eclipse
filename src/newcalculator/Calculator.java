package newcalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator  extends JFrame       {
	private String operator[]= {"+","-","*","/"};
	private JTextField text1=new JTextField(10);//��һ�����������ڵ��ı���
	private JTextField text2=new JTextField(10);//�ڶ������������ڵ��ı���
	private JTextField text3=new JTextField(10);//���������ڵ��ı���
	private JComboBox box=new JComboBox(operator);//���������б���ʵ�����������ѡ��
	private JButton equalbutton=new JButton("=");//�������İ�ť
	public Calculator(String s) {
		super(s);
		Container contentpane=this.getContentPane();//��ȡJFrame���������
		contentpane.setLayout(new FlowLayout(5));//����Ϊ�����ֹ�����
		contentpane.add(text1);
		contentpane.add(box);
		contentpane.add(text2);
		contentpane.add(equalbutton);
		contentpane.add(text3);
		//�����������������������
		equalbutton.addActionListener(new MyActionListener());//�ȺŰ�ťע���¼�������
		setBounds(50, 50, 500, 100);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}
	//�����ڲ����ʵ��ʱ�������
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String str=box.getSelectedItem().toString();//���������б�ǰѡ���Ǹ����ת�����ַ�����������str
			int result=0;
			int number1=Integer.parseInt(text1.getText());
			int number2=Integer.parseInt(text2.getText());
			//�����ı������ݲ�����ԭ�����ַ�����������ת����int��
			if(str=="+") {
				result=number1+number2;
				text3.setText(String.valueOf(result));
				//���ӷ����㲢��int�ͽ��ת����String���ͺ�����Ϊ�ı�������
			}
			else if(str=="-"){
				result=number1-number2;
				text3.setText(String.valueOf(result));
			}
			else if(str=="*"){
				result=number1*number2;
				text3.setText(String.valueOf(result));
			}
			else {
				result=number1/number2;
				text3.setText(String.valueOf(result));
			}
			// TODO Auto-generated method stub
			
		}
		
	}
		
	}


