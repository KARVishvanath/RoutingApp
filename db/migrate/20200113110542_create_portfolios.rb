class CreatePortfolios < ActiveRecord::Migration[6.0]
  def change
    create_table :portfolios do |t|
      t.string :title
      t.string :sub_title
      t.text :body
      t.text :main_img
      t.text :thamb_img

      t.timestamps
    end
  end
end
