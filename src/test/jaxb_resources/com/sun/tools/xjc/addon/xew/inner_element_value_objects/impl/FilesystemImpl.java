
package inner_element_value_objects.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import inner_element_value_objects.Filesystem;
import inner_element_value_objects.Volume;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileListing",
    "directoryListing",
    "volumes"
})
@XmlRootElement(name = "filesystem")
public class FilesystemImpl implements Filesystem
{

    @XmlElementWrapper(name = "file-listing", required = true)
    @XmlElement(name = "file-item", type = FilesystemImpl.FileItemImpl.class)
    protected List<Filesystem.FileItem> fileListing = new ArrayList<Filesystem.FileItem>();
    @XmlElementWrapper(name = "directory-listing", required = true)
    @XmlElement(name = "directory-item")
    protected List<String> directoryListing = new ArrayList<String>();
    @XmlElementWrapper(name = "volumes", required = true)
    @XmlElement(name = "volume", type = VolumeImpl.class)
    protected List<Volume> volumes = new ArrayList<Volume>();

    public List<Filesystem.FileItem> getFileListing() {
        return fileListing;
    }

    public void setFileListing(List<Filesystem.FileItem> fileListing) {
        this.fileListing = fileListing;
    }

    public List<String> getDirectoryListing() {
        return directoryListing;
    }

    public void setDirectoryListing(List<String> directoryListing) {
        this.directoryListing = directoryListing;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class FileItemImpl implements Filesystem.FileItem
    {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected BigInteger size;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public BigInteger getSize() {
            return size;
        }

        public void setSize(BigInteger value) {
            this.size = value;
        }

    }

}
