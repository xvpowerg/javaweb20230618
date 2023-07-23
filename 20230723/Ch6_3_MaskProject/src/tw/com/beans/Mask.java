package tw.com.beans;

public class Mask {
		private String id;
		private String name;
		private String maskAduilt;
		private String maskChild;
		
		public String getMaskChild() {
			return maskChild;
		}
		public void setMaskChild(String maskChild) {
			this.maskChild = maskChild;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMaskAduilt() {
			return maskAduilt;
		}
		public void setMaskAduilt(String maskAduilt) {
			this.maskAduilt = maskAduilt;
		}

		@Override
		public String toString() {
			return "Mask [id=" + id + ", name=" + name + ", maskAduilt=" + maskAduilt + ", maskChild=" + maskChild
					+ "]";
		}
		
}
