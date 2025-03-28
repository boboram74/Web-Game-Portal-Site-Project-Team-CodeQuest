package service.qnareply;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class QnAReplyDTO {
	private int qnaReplyId;
	private int qnaId;
	private int memberId;
	private Timestamp regDate;
	private String context;
	private String writer;
	
	public QnAReplyDTO(int qnaReplyId, int qnaId, int memberId, Timestamp regDate, String context, String writer) {
		super();
		this.qnaReplyId = qnaReplyId;
		this.qnaId = qnaId;
		this.memberId = memberId;
		this.regDate = regDate;
		this.context = context;
		this.writer = writer;
	}
	
	public QnAReplyDTO(int qnaId, int memberId, String context) {
		this.qnaId = qnaId;
		this.memberId = memberId;
		this.context = context;
	}

	public int getQnaReplyId() {
		return qnaReplyId;
	}

	public int getQnaId() {
		return qnaId;
	}

	public int getMemberId() {
		return memberId;
	}

	public Timestamp getRegDate() {
		return regDate;
	}
	
	public String getContext() {
		return context;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public static QnAReplyDTO of(ResultSet rs) throws SQLException {
		return new QnAReplyDTO(
				rs.getInt("QNA_REPLY_ID"),
				rs.getInt("QNA_ID"),
				rs.getInt("MEMBER_ID"),
				rs.getTimestamp("REG_DATE"),
				rs.getString("CONTEXT"),
				rs.getString("NICKNAME"));
	}
}
