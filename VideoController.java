package fh.aalen.video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

	/*
	 * //für eine spätere Vorlesung rausgenommen (VideoService) private List<Video>
	 * videolist = new ArrayList<Video>(Arrays.asList( new Video("Edge of Tomorrow",
	 * "16", "In Zeitschleife gefangen", "SciFi"), new Video("Security", "18",
	 * "Marine rettet Mädchen in Kaufhaus", "Action") ));
	 * 
	 * @RequestMapping("/videos") public List<Video> getVideoList() { return
	 * this.videolist; }
	 * 
	 * @RequestMapping("/videos/{title}") public Video getVideo(@PathVariable String
	 * title) { for (Video v:videolist) { if(v.getTitle().equals(title)) return v; }
	 * return null; }
	 * 
	 * @RequestMapping(method=RequestMethod.POST, value="/videos") public void
	 * addVideo(@RequestBody Video video) { videolist.add(video); }
	 * 
	 * @RequestMapping(method=RequestMethod.PUT, value="/videos/{title}") public
	 * void updateVideo(@PathVariable String title, @RequestBody Video video) {
	 * for(int i=0; i<videolist.size(); i++) { Video v = videolist.get(i);
	 * if(v.getTitle().equals(title)) { videolist.set(i, video); } } }
	 * 
	 * @RequestMapping(method=RequestMethod.DELETE, value="/videos/{title}") public
	 * void deleteVideo(@PathVariable String title) { for(int i=0;
	 * i<this.videolist.size(); i++) { Video v = videolist.get(i);
	 * if(v.getTitle().equals(title)) { videolist.remove(i); return; } } }
	 */

	@Autowired
	VideoService videoService;

	@RequestMapping("/videos")
	public List<Video> getVideoList() {
		return videoService.getVideoList();
	}

	@RequestMapping("/videos/{title}")
	public Video getVideo(@PathVariable String title) {
		return videoService.getVideo(title);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/videos")
	public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/videos/{title}")
	public void updateVideo(@PathVariable String title, @RequestBody Video video) {
		videoService.updateVideo(title, video);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/videos/{title}")
	public void deleteVideo(@PathVariable String title) {
		videoService.deleteVideo(title);
	}
}
