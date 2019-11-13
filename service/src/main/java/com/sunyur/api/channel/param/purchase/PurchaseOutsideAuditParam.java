package com.sunyur.api.channel.param.purchase;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  purchase apply audit</p>
 * <p>className    :  PurchaseApplyOutsideAuditResultParam </p>
 * <p>create time  :  2019-08-28 11:38</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class PurchaseOutsideAuditParam implements Serializable {

	private static final long serialVersionUID = -5548137854183331299L;

	/**
	 * 来源单据类型：默认为采购申请(0：采购申请)
	 */
	private Integer sourceType;

	/**
	 * 申请单号：对应协同purchaseApplyCode
	 */
	private String sourceCode;
	/**
	 * 最终状态(0 待审批 1 审批通过 2 审批驳回)
	 */
	private Integer status;
	/**
	 * 最终状态描述
	 */
	private String statusDesc;
	/**
	 * 审批记录列表
	 */
	private List<ApplyAuditRecord> auditRecordList;

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public List<ApplyAuditRecord> getAuditRecordList() {
		return auditRecordList;
	}

	public void setAuditRecordList(List<ApplyAuditRecord> auditRecordList) {
		this.auditRecordList = auditRecordList;
	}

	public static class ApplyAuditRecord {
		/**
		 * 审核时间
		 */
		private Date auditTime;
		/**
		 * 节点状态(0 待审批 1 审批通过 2 审批驳回)
		 */
		private Integer status;
		/**
		 * 节点审核状态描述
		 */
		private String statusDesc;
		/**
		 * 审核人姓名
		 */
		private String auditorName;
		/**
		 * 审核人工号
		 */
		private String auditorCode;

		/**
		 * 审批节点名称
		 */
		private String auditNodeName;

		public String getAuditNodeName() {
			return auditNodeName;
		}

		public void setAuditNodeName(String auditNodeName) {
			this.auditNodeName = auditNodeName;
		}

		public Date getAuditTime() {
			return auditTime;
		}

		public void setAuditTime(Date auditTime) {
			this.auditTime = auditTime;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusDesc() {
			return statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getAuditorName() {
			return auditorName;
		}

		public void setAuditorName(String auditorName) {
			this.auditorName = auditorName;
		}

		public String getAuditorCode() {
			return auditorCode;
		}

		public void setAuditorCode(String auditorCode) {
			this.auditorCode = auditorCode;
		}
	}
}
