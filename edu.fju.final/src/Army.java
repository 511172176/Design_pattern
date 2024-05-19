//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Command模式實現
// Army class to be used with commands


class Army {
	private String status;	
	
    public void attack() {
    	this.setStatus("attack");
        System.out.println("Army is attacking!");
    }
    
    public void defend() {
    	this.setStatus("defend");
        System.out.println("Army is defending!");
    }

    public void retreat() {
    	this.setStatus("retreat");
        System.out.println("Army is retreating!");
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
