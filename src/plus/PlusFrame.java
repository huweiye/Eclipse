package plus;

import java.awt.*;
import java.awt.event.*;

public class PlusFrame extends Frame {
	private Label label = new Label("+");// +号按钮设置为label
	private Button equalbutton = new Button("=");// =号按钮
	private TextField text1 = new TextField(10);// 第一个加数
	private TextField text2 = new TextField(10);// 第二个加数
	private TextField text3 = new TextField(10);// 和

	public PlusFrame() {
		this.setLayout(new FlowLayout(5));// 五个组件采用流体布局，即使其在一行
		this.add(text1);
		this.add(label);
		this.add(text2);
		this.add(equalbutton);
		this.add(text3);// 依次添加
		this.setBounds(50, 50, 400, 100);
		this.setVisible(true);// 设置可见
		equalbutton.addActionListener(new MyActionListener());// 注册等号使其返回结果即可，加号无需注册
		//下面这一段是采用外部类的方式实现事件监听处理器
		//equalbutton.addActionListener(new MyActionListener(text1,text2,text3));
		this.addWindowListener(new MyWindowListener());// 窗口配适器，使关闭窗口
	}// 构造方法终结
		// 以下为实现了两数相加并得到和的内部类
	//采用了命名内部类的方法
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(text1.getText());
				int number2=Integer.parseInt(text2.getText());
				//返回文本框内容并将其原本的字符串常量类型转换成int型
				int result=0;
				result=number1+number2;
				text3.setText(String.valueOf(result));
		}

	}
	

	// 以下为继承窗口配适器实现窗口关闭的类
	private class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}
	
}
//以下为通过定义外部类的方法来实现事件监听器
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
			//返回文本框内容并将其原本的字符串常量类型转换成int型
			int result=0;
			result=number1+number2;
			text3.setText(String.valueOf(result));
		}
		
	}
	*/
