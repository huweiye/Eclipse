package newcalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator  extends JFrame       {
	private String operator[]= {"+","-","*","/"};
	private JTextField text1=new JTextField(10);//第一个运算数所在的文本框
	private JTextField text2=new JTextField(10);//第二个运算数所在的文本框
	private JTextField text3=new JTextField(10);//运算结果所在的文本框
	private JComboBox box=new JComboBox(operator);//创建下拉列表来实现四则运算的选择
	private JButton equalbutton=new JButton("=");//输出结果的按钮
	public Calculator(String s) {
		super(s);
		Container contentpane=this.getContentPane();//获取JFrame的内容面板
		contentpane.setLayout(new FlowLayout(5));//设置为流布局管理器
		contentpane.add(text1);
		contentpane.add(box);
		contentpane.add(text2);
		contentpane.add(equalbutton);
		contentpane.add(text3);
		//各组件依次添加在内容面板上
		equalbutton.addActionListener(new MyActionListener());//等号按钮注册事件监听器
		setBounds(50, 50, 500, 100);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}
	//命名内部类的实现时间监听器
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String str=box.getSelectedItem().toString();//返回下拉列表当前选手那个的项并转化成字符串常量赋给str
			int result=0;
			int number1=Integer.parseInt(text1.getText());
			int number2=Integer.parseInt(text2.getText());
			//返回文本框内容并将其原本的字符串常量类型转换成int型
			if(str=="+") {
				result=number1+number2;
				text3.setText(String.valueOf(result));
				//做加法运算并将int型结果转换成String类型后设置为文本框内容
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


