package core.model.material;

public class Material {
	private int materialID;
	private String name;
	private String version;
	private String author;
	private String description;
	private String type;
	private int releaseYear;

	public Material() {
		
	}

	public Material(int materialID, String name, String version, String author, String description, String type,
			int releaseDate) {
		super();
		this.materialID = materialID;
		this.name = name;
		this.version = version;
		this.author = author;
		this.description = description;
		this.type = type;
		this.releaseYear = releaseDate;
	}

	public int getMaterialID() {
		return materialID;
	}

	public void setMaterialID(int materialID) {
		this.materialID = materialID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getReleaseDate() {
		return releaseYear;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseYear = releaseDate;
	}

	@Override
	public String toString() {
		return "Material [materialID=" + materialID + ", name=" + name + ", version=" + version + ", author=" + author
				+ ", description=" + description + ", type=" + type + ", releaseDate=" + releaseYear + "]";
	}
	
	

}
