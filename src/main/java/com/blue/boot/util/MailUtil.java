//package com.blue.boot.util;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
//import javax.mail.*;
//import javax.mail.Message.RecipientType;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeUtility;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.security.Security;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Properties;
//
//
///**
// * 发送给多人的邮件工具
// *
// * @author guoyu
// */
//public class MailUtil {
//	private static Log logger = LogFactory.getLog(MailUtil.class);
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 10000; i++) {
//			try {
//				Integer u = null;
//				int a = 0 / u;
//			} catch (Exception e) {
//				sendMail(e);
//			}
//			System.out.println("添加进线程目标 ,多少次: " + (i + 1));
//		}
//	}
//
//	/**
//	 * 发送邮件
//	 *
//	 * @author guoyu
//	 */
//	public static String sendMail(Throwable e) {
//		try {
//			return sendMail(e, "");
//		} catch (Throwable e2) {
//			logger.error(e2);
//		}
//
//		return null;
//	}
//
//
//	/**
//	 * 发送邮件.
//	 * 如果需要主题subject从配置文件中读取,请传subject为null值
//	 *
//	 * @param content
//	 * @param subject
//	 * @author guoyu
//	 */
//	public static final void sendMail(String content, String subject) {
//		try {
//			DetailMail mail = new DetailMail(content, subject, new Date());
//			ThreadPoolForSecondary.execute(mail);
//		}catch (Throwable e2) {
//			logger.error(e2);
//		}
//	}
//
//	/**
//	 * 私有方法
//	 * @author guoyu
//	 */
//	public static String sendMail(Throwable e, String subject) {
//		if (e == null)
//			return null;
//
//		StringWriter sw = new StringWriter();
//		PrintWriter pw = new PrintWriter(sw);
//		e.printStackTrace(pw);
//		String msg = sw.toString();
//
//		try {
//			if (sw != null)
//				sw.close();
//			if (pw != null)
//				pw.close();
//		} catch (IOException e1) {
//			String msg2 = "关闭流sw.close() || pw.close(),发生异常";
//			msg += ("<br>" + msg2);
//			logger.error(msg2, e1);
//		}
//
//		MailUtil.sendMail(msg, subject);
//		return msg;
//	}
//
//	/**
//	 * 邮件类
//	 *
//	 * @author guoyu
//	 */
//	public static class DetailMail implements Runnable {
//		private String sender;
//		private String[] receiver;
//		private String content;
//		private String subject;
//
//		private String host;
//		private String port;
//
//		private String userName;
//		private String passWord;
//		private Date sendDate;
//		private Date now;
//
//		//读取邮件配置文件
//		public final static PropertiesHelper mailConfig = new PropertiesHelper("mailConfig");
//
//		/**
//		 * 初始化邮件数据
//		 *
//		 * @author guoyu
//		 */
//		private void initDetailMail(String content, String subject) {
//			String isEnable = mailConfig.getProperty("enable");
//			if (!"1".equals(isEnable)) return;
//			String sender = mailConfig.getProperty("sender");
//			String[] receiver = mailConfig.getProperty("receiver").split(",");
//			String userName = mailConfig.getProperty("username");
//			String passWord = mailConfig.getProperty("password");
//			String host = mailConfig.getProperty("host");
//			String port = mailConfig.getProperty("port");
//			String subject3 = Config.API_BASEURL.indexOf("vi-ni") != -1 ? "vi-ni_" : "v-ka_";
//			String subject2 = subject3 + mailConfig.getProperty("subject") + "_exception";
//
//			if (subject == null || "".equals(subject)) {
//				if (subject2 != null && !"".equals(subject2)) subject = subject2;
//				else subject = "Cheng_Hong CRM_ERR";
//			}
//
//			this.setPort(port);
//			this.setHost(host);
//			this.setUserName(userName);
//			this.setPassWord(passWord);
//			String dateString = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SS毫秒").format(getNow());
//			this.setContent("主题: " + subject + "<br>时间: " + dateString + "<br><div style='color:red;'> <pre>" + content + "</pre> </div>");
//			this.setReceiver(receiver);
//			this.setSender(sender);
//			this.setSubject(subject);
//		}
//
//
//		public DetailMail(String content, String subject, Date now) {
//			if(content == null) content = "null";
//			setContent(content);
//			setSubject(subject);
//			setNow(now);
//		}
//
//		public Date getNow() {
//			return now;
//		}
//
//		public void setNow(Date now) {
//			this.now = now;
//		}
//
//		public Date getSendDate() {
//			return new Date();
//		}
//
//
//		public void setSendDate(Date sendDate) {
//			this.sendDate = sendDate;
//		}
//
//
//		public String getSender() {
//			return sender;
//		}
//
//
//		public void setSender(String sender) {
//			this.sender = sender;
//		}
//
//
//		public String[] getReceiver() {
//			return receiver;
//		}
//
//
//		public void setReceiver(String[] receiver) {
//			this.receiver = receiver;
//		}
//
//
//		public String getContent() {
//			return content;
//		}
//
//
//		public void setContent(String content) {
//			this.content = content;
//		}
//
//
//		public String getSubject() {
//			return subject;
//		}
//
//
//		public void setSubject(String subject) {
//			this.subject = subject;
//		}
//
//
//		public String getHost() {
//			return host;
//		}
//
//
//		public void setHost(String host) {
//			this.host = host;
//		}
//
//
//		public String getPort() {
//			return port;
//		}
//
//
//		public void setPort(String port) {
//			this.port = port;
//		}
//
//
//		public String getUserName() {
//			return userName;
//		}
//
//
//		public void setUserName(String userName) {
//			this.userName = userName;
//		}
//
//
//		public String getPassWord() {
//			return passWord;
//		}
//
//
//		public void setPassWord(String passWord) {
//			this.passWord = passWord;
//		}
//
//
//		@SuppressWarnings("restriction")
//		public void run() {
//			initDetailMail(getContent(), getSubject());
//
//			Properties props = new Properties();
//			props.put("mail.smtp.host", host);
//			props.put("mail.smtp.auth", "true");
//			props.put("mail.smtp.port", port);
//
//			int ex = host.indexOf("smtp.exmail");
//			if (ex != -1) {
//				Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//				final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
//				props.put("mail.transport.protocol", "smtp");
//				props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
//				props.put("mail.smtp.socketFactory.fallback", "false");
//				props.put("mail.smtp.socketFactory.port", port);
//			}
//
//			Session mailSession = Session.getDefaultInstance(props,
//					new Authenticator() {
//						@Override
//						protected PasswordAuthentication getPasswordAuthentication() {
//							return new PasswordAuthentication(userName, passWord);
//						}
//					});
//
//			Message msg = new MimeMessage(mailSession);
//			String msg1 = null;
//			try {
//				InternetAddress[] internetAddressArr = new InternetAddress[receiver.length];
//				for (int i = 0; i < receiver.length; i++) {
//					internetAddressArr[i] = new InternetAddress(receiver[i]);
//				}
//
//				msg.setRecipients(RecipientType.TO, internetAddressArr);
//				msg.setSubject(MimeUtility.encodeText(this.subject, "UTF-8", "B"));
//				msg.setSentDate(getSendDate());
//				msg.setFrom(new InternetAddress(this.sender));
//				msg.setContent(this.content, "text/html; charset=utf-8");
//				Transport.send(msg);
//				msg1 = getMsg(subject, receiver, true);
//
//			} catch (Exception e) {
//				msg1 = getMsg(subject, receiver, false);
//			}
//
//			logger.debug(msg1);
//		}
//	}
//
//	private static String getMsg(String subject, String[] receiver, boolean bool) {
//		Date date = new Date();
//		StringBuffer str = new StringBuffer().append("时间: ").append(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SS毫秒").format(date)).append("   主题: ").append(subject);
//		if (!bool) return str.append("  发送邮件失败! 请检查网络是否通畅或者邮箱地址是否正确").toString();
//		str.append("   成功发送邮件!   己经发送给: ");
//		for (String string : receiver) {
//			str.append(string).append(", ");
//		}
//		return str.toString();
//	}
//
//}