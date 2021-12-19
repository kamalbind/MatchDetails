package com.company.matchdetails.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.matchdetails.R;
import com.company.matchdetails.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecyclerAdapter extends RecyclerView.Adapter<PlayerRecyclerAdapter.PlayerViewHolder> {

    private final List<Player> playerList = new ArrayList<>();

    public void updatePlayer(List<Player> players) {
        playerList.addAll(players);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View playerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new PlayerViewHolder(playerView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player player = playerList.get(position);
        StringBuilder name = new StringBuilder(player.name_Full);
        if (player.iscaptain) {
            name.append(" (c)");
        }
        if (player.iskeeper) {
            name.append(" (wk)");
        }
        holder.getPlayerNameTextView().setText(name);
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {

        private TextView playerNameTextView;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            playerNameTextView = itemView.findViewById(R.id.player_name);
        }

        public TextView getPlayerNameTextView() {
            return playerNameTextView;
        }

    }
}
