package com.playjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pj_post")
public class PostModel {
	
		@Id
		@Column(name="post_id")
		private String strPostId;
		
		@Column(name="post_name")
		private String strPostName;
		
		@Column(name="post_description")
		private String strPostDescription;
		
		@Column(name="post_version")
		private String strPostVersion;
		// foreign key 
		@Column(name="post_content_id")
		private String strPostContentId;
		
		@Column(name="post_author_name")
		private String strPostAuthorName;

		@Column(name="post_reviewer_name")
		private String strPostReviewerName;
		
		@Column(name="post_approver_name")
		private String strPostApproverName;
		
		@Column(name="post_modified_by")
		private String strPostModifiedBy;
		
		@Column(name="used_in_wf")
		private boolean blnUsedInWf;
		
		@Column(name="post_status")
		private String strPostStatus;

		public String getStrPostId() {
			return strPostId;
		}

		public void setStrPostId(String strPostId) {
			this.strPostId = strPostId;
		}

		public String getStrPostName() {
			return strPostName;
		}

		public void setStrPostName(String strPostName) {
			this.strPostName = strPostName;
		}

		public String getStrPostDescription() {
			return strPostDescription;
		}

		public void setStrPostDescription(String strPostDescription) {
			this.strPostDescription = strPostDescription;
		}

		public String getStrPostVersion() {
			return strPostVersion;
		}

		public void setStrPostVersion(String strPostVersion) {
			this.strPostVersion = strPostVersion;
		}

		public String getStrPostContentId() {
			return strPostContentId;
		}

		public void setStrPostContentId(String strPostContentId) {
			this.strPostContentId = strPostContentId;
		}

		public String getStrPostAuthorName() {
			return strPostAuthorName;
		}

		public void setStrPostAuthorName(String strPostAuthorName) {
			this.strPostAuthorName = strPostAuthorName;
		}

		public String getStrPostReviewerName() {
			return strPostReviewerName;
		}

		public void setStrPostReviewerName(String strPostReviewerName) {
			this.strPostReviewerName = strPostReviewerName;
		}

		public String getStrPostApproverName() {
			return strPostApproverName;
		}

		public void setStrPostApproverName(String strPostApproverName) {
			this.strPostApproverName = strPostApproverName;
		}

		public String getStrPostModifiedBy() {
			return strPostModifiedBy;
		}

		public void setStrPostModifiedBy(String strPostModifiedBy) {
			this.strPostModifiedBy = strPostModifiedBy;
		}

		public boolean isBlnUsedInWf() {
			return blnUsedInWf;
		}

		public void setBlnUsedInWf(boolean blnUsedInWf) {
			this.blnUsedInWf = blnUsedInWf;
		}

		public String getStrPostStatus() {
			return strPostStatus;
		}

		public void setStrPostStatus(String strPostStatus) {
			this.strPostStatus = strPostStatus;
		}
		
		
		
}
