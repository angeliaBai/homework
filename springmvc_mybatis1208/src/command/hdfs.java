package command;

import org.junit.Test;

public class hdfs {
	/*
	 * Download a file from HDFS
	 */
	@Test
	public void testDownload(){
   	 Configuration conf = new Configuration(); 
   	 String src="/root/test";
   	 String dst="hdfs://localhost:9000/data/test";
        Path dstPath = new Path(dst) ;  
        try{  
            FileSystem dhfs = dstPath.getFileSystem(conf) ;  
            dhfs.copyToLocalFile(false, new Path(src), dstPath) ;  
        }catch(IOException ie){  
            ie.printStackTrace() ; 
        }   
    }  
	}
	
	/*
	 * Delete a file from HDFS
	 */
	@Test
	public void testDeleteFile(){
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path path = new Path("/user/hadoop/data/test");
		fs.delete(path);
		fs.close();
	}
	
	/*
	 * Remove a directory from HDFS
	 */
	@Test
	public void testRemoveDirectory(){
		 Configuration conf = new Configuration();
	     FileSystem fs = FileSystem.get(conf);
	     Path path = new Path("/user/hadoop/data/test");
	     fs.delete(path);
	     fs.close();
	}
	
	/*
	 * List all the files and sub directory in a directory
	 */
	@Test
	public void testListDirectory(){
		 FileSystem fs = FileSystem.get(conf);
	     Path path = new Path("/user/hadoop");
	     FileStatus[] fileStatus = fs.listStatus(path);
	        for(int i=0;i<fileStatus.length;i++){
	            if(fileStatus[i].isDir()){
	                Path p = new Path(fileStatus[i].getPath().toString());
	                getFile(p,fs);
	            }else{
	                System.out.println(fileStatus[i].getPath().toString());
	            }
	        }
	}
	
}
