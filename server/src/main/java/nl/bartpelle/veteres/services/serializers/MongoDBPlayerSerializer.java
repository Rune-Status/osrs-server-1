package nl.bartpelle.veteres.services.serializers;

import nl.bartpelle.veteres.model.entity.Player;
import nl.bartpelle.veteres.model.uid.UIDProvider;

import java.util.function.Consumer;

/**
 * Created by Bart on 4-3-2015.
 *
 * Serializer which utilizes a MongoDB to store and load player data.
 */
public class MongoDBPlayerSerializer extends PlayerSerializer {

	public MongoDBPlayerSerializer(UIDProvider provider) {
		super(provider);
	}

	@Override
	public boolean loadPlayer(Player player, Object i, String password, Consumer<PlayerLoadResult> fn) {
		fn.accept(PlayerLoadResult.OK);
		return true;
	}

	@Override
	public void savePlayer(Player player) {

	}
}
