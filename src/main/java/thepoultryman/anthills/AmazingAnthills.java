package thepoultryman.anthills;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazingAnthills implements ModInitializer {
	public static final String MOD_ID = "anthills";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing super silly anthills");
	}
}
