package plus;

import java.awt.*;
import java.awt.event.*;

public class PlusFrame extends Frame {
	private Label label = new Label("+");// +�Ű�ť����Ϊlabel
	private Button equalbutton = new Button("=");// =�Ű�ť
	private TextField text1 = new TextField(10);// ��һ������
	private TextField text2 = new TextField(10);// �ڶ�������
	private TextField text3 = new TextField(10);// ��

	public PlusFrame() {
		this.setLayout(new FlowLayout(5));// �������������岼�֣���ʹ����һ��
		this.add(text1);
		this.add(label);
		this.add(text2);
		this.add(equalbutton);
		this.add(text3);// �������
		this.setBounds(50, 50, 400, 100);
		this.setVisible(true);// ���ÿɼ�
		equalbutton.addActionListener(new MyActionListener());// ע��Ⱥ�ʹ�䷵�ؽ�����ɣ��Ӻ�����ע��
		//������һ���ǲ����ⲿ��ķ�ʽʵ���¼�����������
		//equalbutton.addActionListener(new MyActionListener(text1,text2,text3));
		this.addWindowListener(new MyWindowListener());// ������������ʹ�رմ���
	}// ���췽���ս�
		// ����Ϊʵ����������Ӳ��õ��͵��ڲ���
	//�����������ڲ���ķ���
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(text1.getText());
				int number2=Integer.parseInt(text2.getText());
				//�����ı������ݲ�����ԭ�����ַ�����������ת����int��
				int result=0;
				result=number1+number2;
				text3.setText(String.valueOf(result));
		}

	}
	

	// ����Ϊ�̳д���������ʵ�ִ��ڹرյ���
	private class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}
	
}
//����Ϊͨ�������ⲿ��ķ�����ʵ���¼�������
	/*class MyActionListener implements ActionListener {
		private TextField text1 = new TextField(10);
		private TextField text2 = new TextField(10);
		private TextField text3 = new TextField(10);
		MyActionListener(TextField t1,TextField t2,TextField t3){
			text1=t1;
			text2=t2;
			text3=t3;
		}
		public void actionPerformed(ActionEvent e) {
			int number1=Integer.parseInt(text1.getText());
			int number2=Integer.parseInt(text2.getText());
			//�����ı������ݲ�����ԭ�����ַ�����������ת����int��
			int result=0;
			result=number1+number2;
			text3.setText(String.valueOf(result));
		}
		
	}
	*/
